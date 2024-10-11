# DetectedSignature

A structure that holds information regarding a detected signature on a page.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.detected_signature import DetectedSignature

# TODO update the JSON string below
json = "{}"
# create an instance of DetectedSignature from a JSON string
detected_signature_instance = DetectedSignature.from_json(json)
# print the JSON string representation of the object
print(DetectedSignature.to_json())

# convert the object into a dict
detected_signature_dict = detected_signature_instance.to_dict()
# create an instance of DetectedSignature from a dict
detected_signature_from_dict = DetectedSignature.from_dict(detected_signature_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


