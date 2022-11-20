# BlockGeometry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bounding_box** | [**GeometryBoundingBox**](GeometryBoundingBox.md) |  | [optional] 
**polygon** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.block_geometry import BlockGeometry

# TODO update the JSON string below
json = "{}"
# create an instance of BlockGeometry from a JSON string
block_geometry_instance = BlockGeometry.from_json(json)
# print the JSON string representation of the object
print(BlockGeometry.to_json())

# convert the object into a dict
block_geometry_dict = block_geometry_instance.to_dict()
# create an instance of BlockGeometry from a dict
block_geometry_from_dict = BlockGeometry.from_dict(block_geometry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


