import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from './login';


import { map , catchError } from 'rxjs/operators';
import { of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private _httpClient : HttpClient) { }

  login(login: Login){

    let loginUrl = 'http://localhost:8080/dairy-farm/dairyfarm/userlogin';
    return this._httpClient.post(loginUrl,login).pipe(
      map(this.extractData) , catchError(this.handleError)
    );
  }

  extractData(res:Response){
    return res;
  }

  handleError(err:Error){
    return of(err);
  }

}
