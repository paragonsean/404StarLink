# DeleteVcenterClientRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vcenter_client_id** | **str** | ID of resource to be deleted. | 

## Example

```python
from openapi_client.models.delete_vcenter_client_request import DeleteVcenterClientRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteVcenterClientRequest from a JSON string
delete_vcenter_client_request_instance = DeleteVcenterClientRequest.from_json(json)
# print the JSON string representation of the object
print(DeleteVcenterClientRequest.to_json())

# convert the object into a dict
delete_vcenter_client_request_dict = delete_vcenter_client_request_instance.to_dict()
# create an instance of DeleteVcenterClientRequest from a dict
delete_vcenter_client_request_from_dict = DeleteVcenterClientRequest.from_dict(delete_vcenter_client_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


