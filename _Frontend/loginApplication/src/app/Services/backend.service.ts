import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BackendService{

  private baseUrl: String = "http://localhost:8080"
  constructor(private http: HttpClient) { }

  sendDetails(data: any) {
    return this.http.post(`${this.baseUrl}/login`, data);
  }
}
