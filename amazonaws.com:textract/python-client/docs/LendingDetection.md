# LendingDetection

The results extracted for a lending document.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | [optional] 
**selection_status** | [**SelectionStatus**](SelectionStatus.md) |  | [optional] 
**geometry** | [**Geometry**](Geometry.md) |  | [optional] 
**confidence** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.lending_detection import LendingDetection

# TODO update the JSON string below
json = "{}"
# create an instance of LendingDetection from a JSON string
lending_detection_instance = LendingDetection.from_json(json)
# print the JSON string representation of the object
print(LendingDetection.to_json())

# convert the object into a dict
lending_detection_dict = lending_detection_instance.to_dict()
# create an instance of LendingDetection from a dict
lending_detection_from_dict = LendingDetection.from_dict(lending_detection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


