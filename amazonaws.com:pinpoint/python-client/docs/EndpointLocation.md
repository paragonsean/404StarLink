# EndpointLocation

Specifies geographic information about an endpoint.

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
from openapi_client.models.endpoint_location import EndpointLocation

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointLocation from a JSON string
endpoint_location_instance = EndpointLocation.from_json(json)
# print the JSON string representation of the object
print(EndpointLocation.to_json())

# convert the object into a dict
endpoint_location_dict = endpoint_location_instance.to_dict()
# create an instance of EndpointLocation from a dict
endpoint_location_from_dict = EndpointLocation.from_dict(endpoint_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


