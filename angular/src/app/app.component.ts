import { Component, OnInit, ɵɵsetComponentScope } from '@angular/core';
import { environment } from '../environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  title = 'Auth0 Angular SDK Sample';

  ngOnInit(): void {
    console.log(environment);
  }
}
