# GeneratePciDescriptionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **str** | Sets the language of the PCI questionnaire. Its value is a two-character [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639-1) language code, for example, **en**. | [optional] 

## Example

```python
from openapi_client.models.generate_pci_description_request import GeneratePciDescriptionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GeneratePciDescriptionRequest from a JSON string
generate_pci_description_request_instance = GeneratePciDescriptionRequest.from_json(json)
# print the JSON string representation of the object
print(GeneratePciDescriptionRequest.to_json())

# convert the object into a dict
generate_pci_description_request_dict = generate_pci_description_request_instance.to_dict()
# create an instance of GeneratePciDescriptionRequest from a dict
generate_pci_description_request_from_dict = GeneratePciDescriptionRequest.from_dict(generate_pci_description_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


