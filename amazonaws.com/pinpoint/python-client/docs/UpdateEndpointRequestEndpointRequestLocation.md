# UpdateEndpointRequestEndpointRequestLocation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**latitude** | **float** |  | [optional] 
**longitude** | **float** |  | [optional] 
**postal_code** | **str** |  | [optional] 
**region** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_endpoint_request_endpoint_request_location import UpdateEndpointRequestEndpointRequestLocation

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEndpointRequestEndpointRequestLocation from a JSON string
update_endpoint_request_endpoint_request_location_instance = UpdateEndpointRequestEndpointRequestLocation.from_json(json)
# print the JSON string representation of the object
print(UpdateEndpointRequestEndpointRequestLocation.to_json())

# convert the object into a dict
update_endpoint_request_endpoint_request_location_dict = update_endpoint_request_endpoint_request_location_instance.to_dict()
# create an instance of UpdateEndpointRequestEndpointRequestLocation from a dict
update_endpoint_request_endpoint_request_location_from_dict = UpdateEndpointRequestEndpointRequestLocation.from_dict(update_endpoint_request_endpoint_request_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


