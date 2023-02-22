

# UnsampledReport

JSON template for Analytics unsampled report resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID to which this unsampled report belongs. |  [optional] |
|**cloudStorageDownloadDetails** | [**UnsampledReportCloudStorageDownloadDetails**](UnsampledReportCloudStorageDownloadDetails.md) |  |  [optional] |
|**created** | **OffsetDateTime** | Time this unsampled report was created. |  [optional] [readonly] |
|**dimensions** | **String** | The dimensions for the unsampled report. |  [optional] |
|**downloadType** | **String** | The type of download you need to use for the report data file. Possible values include &#x60;GOOGLE_DRIVE&#x60; and &#x60;GOOGLE_CLOUD_STORAGE&#x60;. If the value is &#x60;GOOGLE_DRIVE&#x60;, see the &#x60;driveDownloadDetails&#x60; field. If the value is &#x60;GOOGLE_CLOUD_STORAGE&#x60;, see the &#x60;cloudStorageDownloadDetails&#x60; field. |  [optional] [readonly] |
|**driveDownloadDetails** | [**UnsampledReportDriveDownloadDetails**](UnsampledReportDriveDownloadDetails.md) |  |  [optional] |
|**endDate** | **String** | The end date for the unsampled report. |  [optional] |
|**filters** | **String** | The filters for the unsampled report. |  [optional] |
|**id** | **String** | Unsampled report ID. |  [optional] |
|**kind** | **String** | Resource type for an Analytics unsampled report. |  [optional] [readonly] |
|**metrics** | **String** | The metrics for the unsampled report. |  [optional] |
|**profileId** | **String** | View (Profile) ID to which this unsampled report belongs. |  [optional] |
|**segment** | **String** | The segment for the unsampled report. |  [optional] |
|**selfLink** | **String** | Link for this unsampled report. |  [optional] [readonly] |
|**startDate** | **String** | The start date for the unsampled report. |  [optional] |
|**status** | **String** | Status of this unsampled report. Possible values are PENDING, COMPLETED, or FAILED. |  [optional] [readonly] |
|**title** | **String** | Title of the unsampled report. |  [optional] |
|**updated** | **OffsetDateTime** | Time this unsampled report was last modified. |  [optional] [readonly] |
|**webPropertyId** | **String** | Web property ID to which this unsampled report belongs. The web property ID is of the form UA-XXXXX-YY. |  [optional] |



