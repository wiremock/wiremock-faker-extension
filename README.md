# wiremock-faker-extension
Uses https://github.com/datafaker-net/datafaker to generate random, fake data for using in WireMock responses. 

## Usage

### Step 1: Add to your build file
For Maven users:

```xml
<dependency>
    <groupId>org.wiremock</groupId>
    <artifactId>wiremock-faker-extension</artifactId>
    <version>0.1.0</version>
</dependency>
```

For Gradle users:

```groovy
dependencies {
    implementation 'org.wiremock:wiremock-faker-extension:0.1.0'
}

```
### Step 2: Register the extension with your server
Then, register this extension as you would any other:

```java
new WireMockServer(wireMockConfig().extensions(RandomExtension.class));
```
### Step 3: Use it in your stubs!
```yaml
{{ random 'Name.first_name' }}
```
This will generate random first names in the `en-US` locale for every request.
