# GeometryBoundingBox


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**width** | **float** |  | [optional] 
**height** | **float** |  | [optional] 
**left** | **float** |  | [optional] 
**top** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.geometry_bounding_box import GeometryBoundingBox

# TODO update the JSON string below
json = "{}"
# create an instance of GeometryBoundingBox from a JSON string
geometry_bounding_box_instance = GeometryBoundingBox.from_json(json)
# print the JSON string representation of the object
print(GeometryBoundingBox.to_json())

# convert the object into a dict
geometry_bounding_box_dict = geometry_bounding_box_instance.to_dict()
# create an instance of GeometryBoundingBox from a dict
geometry_bounding_box_from_dict = GeometryBoundingBox.from_dict(geometry_bounding_box_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


