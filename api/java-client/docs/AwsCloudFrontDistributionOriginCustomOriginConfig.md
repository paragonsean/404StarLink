

# AwsCloudFrontDistributionOriginCustomOriginConfig

A custom origin. A custom origin is any origin that is not an Amazon S3 bucket, with one exception. An Amazon S3 bucket that is <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html\">configured with static website hosting</a> is a custom origin. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**httpPort** | [**Integer**](Integer.md) |  |  [optional] |
|**httpsPort** | [**Integer**](Integer.md) |  |  [optional] |
|**originKeepaliveTimeout** | [**Integer**](Integer.md) |  |  [optional] |
|**originProtocolPolicy** | [**String**](String.md) |  |  [optional] |
|**originReadTimeout** | [**Integer**](Integer.md) |  |  [optional] |
|**originSslProtocols** | [**AwsCloudFrontDistributionOriginCustomOriginConfigOriginSslProtocols**](AwsCloudFrontDistributionOriginCustomOriginConfigOriginSslProtocols.md) |  |  [optional] |



