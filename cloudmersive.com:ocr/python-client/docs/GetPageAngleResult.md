# GetPageAngleResult

Result of performing a get-page-angle operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**angle** | **float** | Angle of the page in radians; 0 represents perfectly horizontal | [optional] 
**successful** | **bool** | True if the operation was successful, false otherwise | [optional] 

## Example

```python
from openapi_client.models.get_page_angle_result import GetPageAngleResult

# TODO update the JSON string below
json = "{}"
# create an instance of GetPageAngleResult from a JSON string
get_page_angle_result_instance = GetPageAngleResult.from_json(json)
# print the JSON string representation of the object
print(GetPageAngleResult.to_json())

# convert the object into a dict
get_page_angle_result_dict = get_page_angle_result_instance.to_dict()
# create an instance of GetPageAngleResult from a dict
get_page_angle_result_from_dict = GetPageAngleResult.from_dict(get_page_angle_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


