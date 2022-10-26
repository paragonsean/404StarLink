

# JournalS3ExportDescription

Information about a journal export job, including the ledger name, export ID, creation time, current status, and the parameters of the original export creation request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ledgerName** | [**String**](String.md) |  |  |
|**exportId** | [**String**](String.md) |  |  |
|**exportCreationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  |
|**status** | [**ExportStatus**](ExportStatus.md) |  |  |
|**inclusiveStartTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  |
|**exclusiveEndTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  |
|**s3ExportConfiguration** | [**S3ExportConfiguration**](S3ExportConfiguration.md) |  |  |
|**roleArn** | [**String**](String.md) |  |  |
|**outputFormat** | [**OutputFormat**](OutputFormat.md) |  |  [optional] |



