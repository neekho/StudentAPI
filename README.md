<a name="readme-top"></a>
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
       <li>
      <a href="#api-routes">Routes</a>
      <ul>
           <li><a href="#api-routes">API Routes</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>

  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

![Postman Screenshot](./1.PNG)

![RestController.java Screenshot](./assets/controller.PNG)


![Model.java Screenshot](./assets/MODEL.PNG)

A RESTful student management API that is built on Springboot and PostgreSQL. Similar to [CEU Student Management ](https://github.com/neekho/CEU-Student-Management) except this one is currently does not have a front-end. 

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With



* [![Java][Java.com]][Java-url]
* [![Springboot][Springboot.com]][Springboot-url]
* [![PostgreSQL][PostgreSQL.org]][PostgreSQL-url]


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

Download all the prerequisites below in order.

### Prerequisites
Download all of these to get started

* [Java](https://www.oracle.com/java/technologies/downloads/)
* [PostgreSQL](https://www.postgresql.org/download/)
* [IntelliJ](https://www.jetbrains.com/idea/download/?section=windows)
* [Postman](https://www.postman.com/downloads/)

### Installation

_Once installed, open a command prompt, choose your directory wherein you want to save the project. Finally, clone the repo._


1. Clone the repo
   ```sh
   C:\Users\PC> git clone https://github.com/neekho/StudentAPI.git
   ```
2. Go to the project folder
   ```sh
   C:\Users\PC> cd StudentAPI (the base project folder name)
   ```
3. Open the project using intelliJ
   
4. Run the local server either specify a port number or use the default (8080) with IntelliJ


_Once the local server is running, open up a browser and go to http://localhost:8080/api/v1/student/api_check 
to see if the local server is up and running._


<p align="right">(<a href="#readme-top">back to top</a>)</p>

___________________________________________________________________________________________________

### Routes
Go to _http://localhost:8080/api/v1/student/routes_ for a list of possible routes in the current version of this API, for a detailed version of what does each route do, go to API Routes section.


<p align="right">(<a href="#readme-top">back to top</a>)</p>

___________________________________________________________________________________________________


### API Routes

<h3>v1 Routes</h3>
Refer here for all the list of available routes in the API. You may use Postman or Curl in testing the endpoints or other API testing tools.


* [GET Routes](http://localhost:8080/api/v1/student/routes) _Returns all possible routess in JSON format_
* [GET List](http://localhost:8080/api/v1/student)  _See all existing students in the database._
* [GET Single Object Student](http://localhost:8080/api/v1/student/ID) _Provide a student id at the end of this url or else this will result in a 404._
* [POST Add Student](http://localhost:8080/api/v1/student/post)  _Create a student that will be save in the PostgreSQL database._
* [PUT Update Student](http://localhost:8080/api/v1/student/ID?email=new_value&name=new_name)  _Update existing student data. ID pertains to the student object that will be updated. The email and name is will be the data for that specified student_
* [DELETE Student](http://localhost:8080/api/v1/student/ID)  _Delete an existing student. Provide a student id at the end of this url._

<p align="right">(<a href="#readme-top">back to top</a>)</p>

___________________________________________________________________________________________________


<!-- ROADMAP -->
## Roadmap

- [ ] Student login service
- [ ] Frontend integration with 
- [ ] Filtering and sorting of students



<p align="right">(<a href="#readme-top">back to top</a>)</p>

___________________________________________________________________________________________________

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>




























<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[product-screenshot]: images/screenshot.png

[Java.com]: https://img.shields.io/badge/java-35495E?style=for-the-badge&logo=java&logoColor=white
[Java-url]: https://www.java.com/en/

[Springboot.com]: https://img.shields.io/badge/springboot-35495E?style=for-the-badge&springboot=java&logoColor=white
[Springboot-url]: https://spring.io/projects/spring-boot

[PostgreSQL.org]: https://img.shields.io/badge/PostgreSQL-33415E?style=for-the-badge&logo=postgresql&logoColor=white
[PostgreSQL-url]: https://www.postgresql.org
