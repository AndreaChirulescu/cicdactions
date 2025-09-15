
Create a Kubernetes cluster either locally or own AWS using EKS
Clustername: andreademo
Location: eu-north-1
3 nodes

2. Package any Spring boot application using Github CICD and publish it to a container
registry of Your choice.
  - initialized an springboot app with https://start.spring.io/ selected web
  - modified the application.java to print some simple text on /welcome
  - created new github repo https://github.com/AndreaChirulescu/cicdactions
  - pushed src and pom to repo
  - create maven workflow via actions in github
  - create repo cicddemo in docker based on https://github.com/marketplace/actions/docker-build-push-action
  - create Dockerfile

  - tried locally:
    - run build docker pull andreutza/cicddemo
    - docker run -p 8080:8080 andreutza/cicddemo
    - all ok on localhost:8080/welcome
   
  - added ecr cicd
  - added ecr action to github - but not really needed, since I can just docker image https://hub.docker.com/r/andreutza/cicddemo. Since I had the ecr anyway...



3. Use this image to create a deployment in Kubernetes. The deployment part can also be
done manually to save time.
  - created yaml file with deployment and associated service
  - added deployment steps to actions
  - tag private subnets with kubernetes.io/role/internal-elb 1

on kubectl get svc, this is the external IP of the LB service
k8s-default-cicddemo-e808cff003-1cef9ca49fe912d8.elb.eu-north-1.amazonaws.com
same as 
Load balancer URLs
k8s-default-cicddemo-e808cff003-1cef9ca49fe912d8.elb.eu-north-1.amazonaws.com
from AWS resources.
Add annotation for internet facing in yaml file

    
4. If the Spring boot application requires a database then it should also be packaged and
deployed on the K8s cluster, preferably on a separate node in the cluster.
  - n.a.



