# MarkAsArchivedRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_id** | **str** | Mark as archived by Source Server ID. | 

## Example

```python
from openapi_client.models.mark_as_archived_request import MarkAsArchivedRequest

# TODO update the JSON string below
json = "{}"
# create an instance of MarkAsArchivedRequest from a JSON string
mark_as_archived_request_instance = MarkAsArchivedRequest.from_json(json)
# print the JSON string representation of the object
print(MarkAsArchivedRequest.to_json())

# convert the object into a dict
mark_as_archived_request_dict = mark_as_archived_request_instance.to_dict()
# create an instance of MarkAsArchivedRequest from a dict
mark_as_archived_request_from_dict = MarkAsArchivedRequest.from_dict(mark_as_archived_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


