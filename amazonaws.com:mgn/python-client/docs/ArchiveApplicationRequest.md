# ArchiveApplicationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** | Application ID. | 

## Example

```python
from openapi_client.models.archive_application_request import ArchiveApplicationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ArchiveApplicationRequest from a JSON string
archive_application_request_instance = ArchiveApplicationRequest.from_json(json)
# print the JSON string representation of the object
print(ArchiveApplicationRequest.to_json())

# convert the object into a dict
archive_application_request_dict = archive_application_request_instance.to_dict()
# create an instance of ArchiveApplicationRequest from a dict
archive_application_request_from_dict = ArchiveApplicationRequest.from_dict(archive_application_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


