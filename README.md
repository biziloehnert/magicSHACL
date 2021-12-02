<div id="top"></div>

# Magic Shapes for SHACL Validation

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
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project
This project implements the **Magic Shapes Algorithm**, that is an optimization technique for [SHACL](https://www.w3.org/TR/shacl/) validation. It takes as input a shapes graph (in [Turtle](https://www.w3.org/TR/turtle/) or abstract syntax) and outputs a new **magic** shapes graph (in [Turtle](https://www.w3.org/TR/turtle/) and abstract syntax). The magic shapes graph contains shape constraints relevant for validating the target(s) and enable validation only on nodes of an [RDF](https://www.w3.org/TR/rdf11-concepts/) data graph relevant to the target(s).  

<p align="right">(<a href="#top">back to top</a>)</p>

### Built With

* [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/)
* [Xtend](https://www.eclipse.org/xtend/index.html)
* [Xtext](https://www.eclipse.org/Xtext/)
* [Java](https://www.oracle.com/java/)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

### Installation

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTRIBUTING -->
## Contributing
Any contributions are **greatly appreciated**. If you have a suggestion that would make this better, please fork the repo and create a pull request.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/MagicFeature`)
3. Commit your Changes (`git commit -m 'Add some MagicFeature'`)
4. Push to the Branch (`git push origin feature/MagicFeature`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Bianca Löhnert - [LinkedIn][linkedin-url] - bianca@loehnert-net.at

Project Link: [https://github.com/biziloehnert/magicSHACL](https://github.com/biziloehnert/magicSHACL)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: www.linkedin.com/in/bianca-loehnert
[product-screenshot]: images/screenshot.png
