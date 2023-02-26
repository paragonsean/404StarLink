

# AwsS3Data

An AwsS3Data resource can be a data source, but not a data sink. In an AwsS3Data resource, an object's name is the S3 object's key name.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**awsAccessKey** | [**AwsAccessKey**](AwsAccessKey.md) |  |  [optional] |
|**bucketName** | **String** | Required. S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)). |  [optional] |
|**path** | **String** | Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;. |  [optional] |
|**roleArn** | **String** | The Amazon Resource Name (ARN) of the role to support temporary credentials via &#x60;AssumeRoleWithWebIdentity&#x60;. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a &#x60;AssumeRoleWithWebIdentity&#x60; call for the provided role using the GoogleServiceAccount for this project. |  [optional] |



