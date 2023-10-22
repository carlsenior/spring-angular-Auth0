import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import config from '../../auth_config.json';

@Injectable({
  providedIn: 'root',
})
export class ApiService {
  constructor(private http: HttpClient) {}

  ping$() {
    return this.http.get(`${config.apiUri}/api/v1`);
  }

  getAdminMessage$() {
    return this.http.get(`${config.apiUri}/api/v1/bookings/admin/messages`);
  }

  getBook$() {
    return this.http.get(`${config.apiUri}/api/v1/bookings/retrieveBookings`)
  }

  postBook$() {
    return this.http.post(`${config.apiUri}/api/v1/bookings/saveBooking`, {
      payload: "Hello Spring!"
    })
  }

  deleteBook$() {
    return this.http.delete(`${config.apiUri}/api/v1/bookings/deleteBooking/123`)
  }

  modifyBook$() {
    return this.http.put(`${config.apiUri}/api/v1/bookings/modifyBooking`, {})
  }

  updateBook$() {
    return this.http.patch(`${config.apiUri}/api/v1/bookings/updateBooking`, {})
  }
}
