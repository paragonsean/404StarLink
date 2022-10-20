# DisconnectFromServiceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_id** | **str** | Request to disconnect Source Server from service by Server ID. | 

## Example

```python
from openapi_client.models.disconnect_from_service_request import DisconnectFromServiceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DisconnectFromServiceRequest from a JSON string
disconnect_from_service_request_instance = DisconnectFromServiceRequest.from_json(json)
# print the JSON string representation of the object
print(DisconnectFromServiceRequest.to_json())

# convert the object into a dict
disconnect_from_service_request_dict = disconnect_from_service_request_instance.to_dict()
# create an instance of DisconnectFromServiceRequest from a dict
disconnect_from_service_request_from_dict = DisconnectFromServiceRequest.from_dict(disconnect_from_service_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


