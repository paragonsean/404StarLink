# ShareProfileRequestPatient


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hip_code** | **str** | additional details about HIP retrieved after scanning QR. | [optional] 
**user_demographics** | [**ShareProfileRequestPatientUserDemographics**](ShareProfileRequestPatientUserDemographics.md) |  | 

## Example

```python
from openapi_client.models.share_profile_request_patient import ShareProfileRequestPatient

# TODO update the JSON string below
json = "{}"
# create an instance of ShareProfileRequestPatient from a JSON string
share_profile_request_patient_instance = ShareProfileRequestPatient.from_json(json)
# print the JSON string representation of the object
print(ShareProfileRequestPatient.to_json())

# convert the object into a dict
share_profile_request_patient_dict = share_profile_request_patient_instance.to_dict()
# create an instance of ShareProfileRequestPatient from a dict
share_profile_request_patient_from_dict = ShareProfileRequestPatient.from_dict(share_profile_request_patient_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


