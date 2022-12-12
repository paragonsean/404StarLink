# PatientLinkReferenceResultLink


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authentication_type** | **str** |  | 
**meta** | [**Meta**](Meta.md) |  | [optional] 
**reference_number** | **str** |  | 

## Example

```python
from openapi_client.models.patient_link_reference_result_link import PatientLinkReferenceResultLink

# TODO update the JSON string below
json = "{}"
# create an instance of PatientLinkReferenceResultLink from a JSON string
patient_link_reference_result_link_instance = PatientLinkReferenceResultLink.from_json(json)
# print the JSON string representation of the object
print(PatientLinkReferenceResultLink.to_json())

# convert the object into a dict
patient_link_reference_result_link_dict = patient_link_reference_result_link_instance.to_dict()
# create an instance of PatientLinkReferenceResultLink from a dict
patient_link_reference_result_link_from_dict = PatientLinkReferenceResultLink.from_dict(patient_link_reference_result_link_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


