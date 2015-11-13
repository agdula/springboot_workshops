NAME = michal_dec/springboot_workshops
VERSION = 1
REPO = quay.io

all: release

build:
	mvn package
	docker build -t $(REPO)/$(NAME):$(VERSION) .

release: build
	docker push $(REPO)/$(NAME):$(VERSION)