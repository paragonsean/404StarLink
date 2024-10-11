# GeneratePciDescriptionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The generated questionnaires in a base64 encoded format. | [optional] 
**language** | **str** | The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code for the questionnaire. For example, **en**. | [optional] 
**pci_template_references** | **List[str]** | The array of Adyen-generated unique identifiers for the questionnaires. | [optional] 

## Example

```python
from openapi_client.models.generate_pci_description_response import GeneratePciDescriptionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GeneratePciDescriptionResponse from a JSON string
generate_pci_description_response_instance = GeneratePciDescriptionResponse.from_json(json)
# print the JSON string representation of the object
print(GeneratePciDescriptionResponse.to_json())

# convert the object into a dict
generate_pci_description_response_dict = generate_pci_description_response_instance.to_dict()
# create an instance of GeneratePciDescriptionResponse from a dict
generate_pci_description_response_from_dict = GeneratePciDescriptionResponse.from_dict(generate_pci_description_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


