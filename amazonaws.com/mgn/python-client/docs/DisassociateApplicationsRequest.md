# DisassociateApplicationsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_ids** | **List** |  | 
**wave_id** | **str** |  | 

## Example

```python
from openapi_client.models.disassociate_applications_request import DisassociateApplicationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DisassociateApplicationsRequest from a JSON string
disassociate_applications_request_instance = DisassociateApplicationsRequest.from_json(json)
# print the JSON string representation of the object
print(DisassociateApplicationsRequest.to_json())

# convert the object into a dict
disassociate_applications_request_dict = disassociate_applications_request_instance.to_dict()
# create an instance of DisassociateApplicationsRequest from a dict
disassociate_applications_request_from_dict = DisassociateApplicationsRequest.from_dict(disassociate_applications_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


