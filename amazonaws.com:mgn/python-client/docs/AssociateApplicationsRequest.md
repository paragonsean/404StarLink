# AssociateApplicationsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_ids** | **List[str]** | Application IDs list. | 
**wave_id** | **str** | Wave ID. | 

## Example

```python
from openapi_client.models.associate_applications_request import AssociateApplicationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateApplicationsRequest from a JSON string
associate_applications_request_instance = AssociateApplicationsRequest.from_json(json)
# print the JSON string representation of the object
print(AssociateApplicationsRequest.to_json())

# convert the object into a dict
associate_applications_request_dict = associate_applications_request_instance.to_dict()
# create an instance of AssociateApplicationsRequest from a dict
associate_applications_request_from_dict = AssociateApplicationsRequest.from_dict(associate_applications_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


