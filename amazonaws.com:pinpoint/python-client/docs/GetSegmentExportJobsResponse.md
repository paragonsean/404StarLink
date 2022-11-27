# GetSegmentExportJobsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_jobs_response** | [**ExportJobsResponse**](ExportJobsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_segment_export_jobs_response import GetSegmentExportJobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSegmentExportJobsResponse from a JSON string
get_segment_export_jobs_response_instance = GetSegmentExportJobsResponse.from_json(json)
# print the JSON string representation of the object
print(GetSegmentExportJobsResponse.to_json())

# convert the object into a dict
get_segment_export_jobs_response_dict = get_segment_export_jobs_response_instance.to_dict()
# create an instance of GetSegmentExportJobsResponse from a dict
get_segment_export_jobs_response_from_dict = GetSegmentExportJobsResponse.from_dict(get_segment_export_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


