# DisassociateSourceServersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**source_server_ids** | **List** |  | 

## Example

```python
from openapi_client.models.disassociate_source_servers_request import DisassociateSourceServersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DisassociateSourceServersRequest from a JSON string
disassociate_source_servers_request_instance = DisassociateSourceServersRequest.from_json(json)
# print the JSON string representation of the object
print(DisassociateSourceServersRequest.to_json())

# convert the object into a dict
disassociate_source_servers_request_dict = disassociate_source_servers_request_instance.to_dict()
# create an instance of DisassociateSourceServersRequest from a dict
disassociate_source_servers_request_from_dict = DisassociateSourceServersRequest.from_dict(disassociate_source_servers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


