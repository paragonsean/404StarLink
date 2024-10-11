# GetSegmentImportJobsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**import_jobs_response** | [**ImportJobsResponse**](ImportJobsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_segment_import_jobs_response import GetSegmentImportJobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSegmentImportJobsResponse from a JSON string
get_segment_import_jobs_response_instance = GetSegmentImportJobsResponse.from_json(json)
# print the JSON string representation of the object
print(GetSegmentImportJobsResponse.to_json())

# convert the object into a dict
get_segment_import_jobs_response_dict = get_segment_import_jobs_response_instance.to_dict()
# create an instance of GetSegmentImportJobsResponse from a dict
get_segment_import_jobs_response_from_dict = GetSegmentImportJobsResponse.from_dict(get_segment_import_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


