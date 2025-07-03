# 

## Model
www.msaez.io/#/201224579/storming/0703ai

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- user
- book
- admin
- author
- manuscript
- subscription
- point


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- user
```
 http :8088/users userId="userId"userPw="userPw"pass="pass"
```
- book
```
 http :8088/books bookId="bookId"authorId="authorId"bookTitle="bookTitle"category="category"createDate="createDate"modifyDate="modifyDate"bookSummary="bookSummary"bookCoverImage="bookCoverImage"bookContent="bookContent"viewCount="viewCount"likeCount="likeCount"price="price"
```
- admin
```
 http :8088/admins id="id"authorLoginId="authorLoginId"authorPw="authorPw"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"
```
- author
```
 http :8088/authors authorId="authorId"authorPw="authorPw"authorName="authorName"createDate="createDate"authorInfo="authorInfo"authorPortfolio="authorPortfolio"isActive="isActive"
```
- manuscript
```
 http :8088/manuscripts manuscriptId="manuscriptId"authorId="authorId"title="title"category="category"content="content"createDate="createDate"modifyDate="modifyDate"summary="summary"bookCoverImage="bookCoverImage"status="status"
```
- subscription
```
 http :8088/subscriptions id="id"userId="userId"bookId="bookId"bookId="bookId"
```
- point
```
 http :8088/points id="id"userId="userId"changeDate="changeDate"changePoint="changePoint"pointSum="pointSum"reason="reason"
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```
