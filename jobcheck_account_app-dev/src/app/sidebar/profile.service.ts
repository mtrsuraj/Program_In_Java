import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {

  constructor(private http: HttpClient) { }
  url:string = 'http://localhost:3000/posts'
 getProfileData(){
   return this.http.get(this.url);
 }

}
