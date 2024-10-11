# GeocodeExtension


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**county** | **str** |  | [optional] 
**formatted_address** | **str** |  | [optional] 
**geometry** | [**Geometry**](Geometry.md) |  | [optional] 
**postal_code** | **str** |  | [optional] 
**route** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**street_number** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.geocode_extension import GeocodeExtension

# TODO update the JSON string below
json = "{}"
# create an instance of GeocodeExtension from a JSON string
geocode_extension_instance = GeocodeExtension.from_json(json)
# print the JSON string representation of the object
print(GeocodeExtension.to_json())

# convert the object into a dict
geocode_extension_dict = geocode_extension_instance.to_dict()
# create an instance of GeocodeExtension from a dict
geocode_extension_from_dict = GeocodeExtension.from_dict(geocode_extension_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


