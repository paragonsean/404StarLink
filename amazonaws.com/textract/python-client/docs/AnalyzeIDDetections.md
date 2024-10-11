# AnalyzeIDDetections

Used to contain the information detected by an AnalyzeID operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | 
**normalized_value** | [**AnalyzeIDDetectionsNormalizedValue**](AnalyzeIDDetectionsNormalizedValue.md) |  | [optional] 
**confidence** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.analyze_id_detections import AnalyzeIDDetections

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeIDDetections from a JSON string
analyze_id_detections_instance = AnalyzeIDDetections.from_json(json)
# print the JSON string representation of the object
print(AnalyzeIDDetections.to_json())

# convert the object into a dict
analyze_id_detections_dict = analyze_id_detections_instance.to_dict()
# create an instance of AnalyzeIDDetections from a dict
analyze_id_detections_from_dict = AnalyzeIDDetections.from_dict(analyze_id_detections_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


