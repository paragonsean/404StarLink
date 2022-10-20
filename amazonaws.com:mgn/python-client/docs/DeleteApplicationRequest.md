# DeleteApplicationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 

## Example

```python
from openapi_client.models.delete_application_request import DeleteApplicationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteApplicationRequest from a JSON string
delete_application_request_instance = DeleteApplicationRequest.from_json(json)
# print the JSON string representation of the object
print(DeleteApplicationRequest.to_json())

# convert the object into a dict
delete_application_request_dict = delete_application_request_instance.to_dict()
# create an instance of DeleteApplicationRequest from a dict
delete_application_request_from_dict = DeleteApplicationRequest.from_dict(delete_application_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


