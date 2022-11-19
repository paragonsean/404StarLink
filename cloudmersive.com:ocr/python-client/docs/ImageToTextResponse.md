# ImageToTextResponse

Response from an OCR to text operation.  Includes the confience rating and converted text result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mean_confidence_level** | **float** | Confidence level rating of the OCR operation; ratings above 80% are strong. | [optional] 
**text_result** | **str** | Converted text string from the image input. | [optional] 

## Example

```python
from openapi_client.models.image_to_text_response import ImageToTextResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ImageToTextResponse from a JSON string
image_to_text_response_instance = ImageToTextResponse.from_json(json)
# print the JSON string representation of the object
print(ImageToTextResponse.to_json())

# convert the object into a dict
image_to_text_response_dict = image_to_text_response_instance.to_dict()
# create an instance of ImageToTextResponse from a dict
image_to_text_response_from_dict = ImageToTextResponse.from_dict(image_to_text_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


