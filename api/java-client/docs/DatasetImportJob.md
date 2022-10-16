

# DatasetImportJob

<p>Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon Personalize dataset. For more information, see <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html\">CreateDatasetImportJob</a>.</p> <p>A dataset import job can be in one of the following states:</p> <ul> <li> <p>CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED</p> </li> </ul>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobName** | [**String**](String.md) |  |  [optional] |
|**datasetImportJobArn** | [**String**](String.md) |  |  [optional] |
|**datasetArn** | [**String**](String.md) |  |  [optional] |
|**dataSource** | [**CreateDatasetImportJobRequestDataSource**](CreateDatasetImportJobRequestDataSource.md) |  |  [optional] |
|**roleArn** | [**String**](String.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**creationDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**lastUpdatedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**failureReason** | [**String**](String.md) |  |  [optional] |
|**importMode** | [**ImportMode**](ImportMode.md) |  |  [optional] |
|**publishAttributionMetricsToS3** | [**Boolean**](Boolean.md) |  |  [optional] |



