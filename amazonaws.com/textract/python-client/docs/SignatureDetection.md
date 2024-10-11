# SignatureDetection

Information regarding a detected signature on a page.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**confidence** | **float** |  | [optional] 
**geometry** | [**Geometry**](Geometry.md) |  | [optional] 

## Example

```python
from openapi_client.models.signature_detection import SignatureDetection

# TODO update the JSON string below
json = "{}"
# create an instance of SignatureDetection from a JSON string
signature_detection_instance = SignatureDetection.from_json(json)
# print the JSON string representation of the object
print(SignatureDetection.to_json())

# convert the object into a dict
signature_detection_dict = signature_detection_instance.to_dict()
# create an instance of SignatureDetection from a dict
signature_detection_from_dict = SignatureDetection.from_dict(signature_detection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


