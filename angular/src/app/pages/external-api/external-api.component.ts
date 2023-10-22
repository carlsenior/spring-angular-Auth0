import { Component } from '@angular/core';
import { AuthClientConfig } from '@auth0/auth0-angular';
import { response } from 'express';
import { ApiService } from 'src/app/api.service';

@Component({
  selector: 'app-external-api',
  templateUrl: './external-api.component.html',
  styleUrls: ['./external-api.component.css'],
})
export class ExternalApiComponent {
  responseJson: string;
  audience: string | undefined;
  hasApiError = false;

  constructor(
    private api: ApiService,
    private configFactory: AuthClientConfig
  ) {
    this.audience = this.configFactory.get()?.authorizationParams.audience;
  }

  pingApi() {
    this.api.getAdminMessage$().subscribe({
      next: (res) => {
        this.hasApiError = false;
        this.responseJson = JSON.stringify(res, null, 2).trim();
        console.log("get admin message - ", this.responseJson);
      },
      error: () => this.hasApiError = true,
    });

    this.api.getBook$().subscribe({
      next: (res) => {
        this.hasApiError = false;
        let response = JSON.stringify(res, null, 2).trim();
        console.log("get response - ", response);
      },
      error: () => this.hasApiError = true,
    });

    this.api.postBook$().subscribe({
      next: (res) => {
        this.hasApiError = false;
        let response = JSON.stringify(res, null, 2).trim();
        console.log("post response - ", response);
      },
      error: () => this.hasApiError = false
    })

    this.api.deleteBook$().subscribe({
      next: (res) => {
        this.hasApiError = false;
        let response = JSON.stringify(res, null, 2).trim();
        console.log("delete response - ", response);
      }
    })

    this.api.modifyBook$().subscribe({
      next: (res) => {
        this.hasApiError = false;
        let response = JSON.stringify(res, null, 2).trim();
        console.log("put response - ", response);
      }
    })

    this.api.updateBook$().subscribe({
      next: (res) => {
        this.hasApiError = false;
        let response = JSON.stringify(res, null, 2).trim();
        console.log("patch response - ", response);
      }
    })
  }
}
