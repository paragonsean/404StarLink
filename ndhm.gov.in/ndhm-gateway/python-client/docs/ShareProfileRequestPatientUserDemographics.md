# ShareProfileRequestPatientUserDemographics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**PatientAddress**](PatientAddress.md) |  | [optional] 
**day_of_birth** | **int** |  | [optional] 
**gender** | [**PatientGender**](PatientGender.md) |  | 
**health_id** | **str** |  | 
**health_id_number** | **str** |  | 
**identifiers** | [**List[Identifier]**](Identifier.md) |  | [optional] 
**month_of_birth** | **int** |  | [optional] 
**name** | **str** |  | 
**year_of_birth** | **int** |  | 

## Example

```python
from openapi_client.models.share_profile_request_patient_user_demographics import ShareProfileRequestPatientUserDemographics

# TODO update the JSON string below
json = "{}"
# create an instance of ShareProfileRequestPatientUserDemographics from a JSON string
share_profile_request_patient_user_demographics_instance = ShareProfileRequestPatientUserDemographics.from_json(json)
# print the JSON string representation of the object
print(ShareProfileRequestPatientUserDemographics.to_json())

# convert the object into a dict
share_profile_request_patient_user_demographics_dict = share_profile_request_patient_user_demographics_instance.to_dict()
# create an instance of ShareProfileRequestPatientUserDemographics from a dict
share_profile_request_patient_user_demographics_from_dict = ShareProfileRequestPatientUserDemographics.from_dict(share_profile_request_patient_user_demographics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


