# AssociateSourceServersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** | Application ID. | 
**source_server_ids** | **List[str]** | Source server IDs list. | 

## Example

```python
from openapi_client.models.associate_source_servers_request import AssociateSourceServersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateSourceServersRequest from a JSON string
associate_source_servers_request_instance = AssociateSourceServersRequest.from_json(json)
# print the JSON string representation of the object
print(AssociateSourceServersRequest.to_json())

# convert the object into a dict
associate_source_servers_request_dict = associate_source_servers_request_instance.to_dict()
# create an instance of AssociateSourceServersRequest from a dict
associate_source_servers_request_from_dict = AssociateSourceServersRequest.from_dict(associate_source_servers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


