

# DatasetExportJob

<p>Describes a job that exports a dataset to an Amazon S3 bucket. For more information, see <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetExportJob.html\">CreateDatasetExportJob</a>.</p> <p>A dataset export job can be in one of the following states:</p> <ul> <li> <p>CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED</p> </li> </ul>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobName** | [**String**](String.md) |  |  [optional] |
|**datasetExportJobArn** | [**String**](String.md) |  |  [optional] |
|**datasetArn** | [**String**](String.md) |  |  [optional] |
|**ingestionMode** | [**IngestionMode**](IngestionMode.md) |  |  [optional] |
|**roleArn** | [**String**](String.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**jobOutput** | [**DatasetExportJobJobOutput**](DatasetExportJobJobOutput.md) |  |  [optional] |
|**creationDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**lastUpdatedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**failureReason** | [**String**](String.md) |  |  [optional] |



