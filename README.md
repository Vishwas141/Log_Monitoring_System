# MiniProject

This repository contains code for a mini project.

## Contents

- [Description](#description)
- [Prerequisites](#prerequisites)
- [Deployment](#deployment)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Description

The project consists of a Java application (`Main.java`) that is containerized using Docker. The Dockerfile (`Dockerfile`) is provided to build the Docker image for the application. Additionally, a Kubernetes Deployment (`Deployment.yml`) and Service (`Service.yml`) are defined to deploy and expose the application in a Kubernetes cluster.

## Prerequisites

Before deploying the application, ensure you have the following prerequisites:

- Docker installed on your machine to build and run the Docker image.
- Kubernetes cluster set up and configured to deploy the application (e.g., using Minikube, Docker Desktop, or a cloud provider).

## Deployment

To deploy the application in a Kubernetes cluster, follow these steps:

1. Build the Docker image:
    ```bash
    docker build -t satarkar424/raje .
    ```

2. Push the Docker image to a container registry (optional):
    ```bash
    docker push satarkar424/raje
    ```

3. Apply the Kubernetes Deployment and Service configurations:
    ```bash
    kubectl apply -f Deployment.yml
    kubectl apply -f Service.yml
    ```

## Usage

Once the application is deployed, you can access it via the NodePort exposed by the Kubernetes Service. Use the following command to get the NodePort:

```bash
kubectl get service miniproject-service
