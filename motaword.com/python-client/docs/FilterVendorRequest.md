# FilterVendorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clients** | **List[int]** |  | [optional] 
**communication_channel** | **List[str]** |  | [optional] 
**corporate_ids_for_auth** | **List[int]** |  | [optional] 
**corporates** | **List[int]** |  | [optional] 
**country** | **List[str]** |  | [optional] 
**created_at** | **str** |  | [optional] 
**current_services** | **List[str]** |  | [optional] 
**daily_proofreading_capacity** | **int** |  | [optional] 
**daily_translation_capacity** | **int** |  | [optional] 
**destination_languages** | **List[int]** |  | [optional] 
**dtp_software** | **List[str]** |  | [optional] 
**email_address** | **str** |  | [optional] 
**experience** | **List[str]** |  | [optional] 
**first_name** | **str** |  | [optional] 
**id** | **List[int]** |  | [optional] 
**is_certified_translator** | **bool** |  | [optional] 
**is_sworn_translator** | **bool** |  | [optional] 
**language_pairs** | **List[List[int]]** |  | [optional] 
**last_name** | **str** |  | [optional] 
**last_online** | **str** |  | [optional] 
**last_worked** | **str** |  | [optional] 
**memoq** | **int** |  | [optional] 
**memsource** | **int** |  | [optional] 
**min_tqs** | **float** |  | [optional] 
**omegat** | **int** |  | [optional] 
**project_count** | **int** |  | [optional] 
**proofreader_experience** | **int** |  | [optional] 
**provides_creative_writing_service** | **bool** |  | [optional] 
**provides_postedit_service** | **bool** |  | [optional] 
**quote_file_subjects** | **List[str]** |  | [optional] 
**reference** | **str** |  | [optional] 
**sdl_trados** | **int** |  | [optional] 
**search** | **str** |  | [optional] 
**skype_id** | **str** |  | [optional] 
**smartcat** | **int** |  | [optional] 
**smartling** | **int** |  | [optional] 
**source_languages** | **List[int]** |  | [optional] 
**specialization** | **List[str]** |  | [optional] 
**status** | **List[str]** |  | [optional] 
**subtitle_edit** | **int** |  | [optional] 
**subtitle_workshop** | **int** |  | [optional] 
**translator_association** | **str** |  | [optional] 
**transsuite_2000** | **int** |  | [optional] 
**user_working_timezone** | **List[str]** |  | [optional] 
**vendor_profile_lsp** | **str** |  | [optional] 
**vendor_tags** | **List[str]** |  | [optional] 
**vendor_type** | **List[str]** |  | [optional] 
**vendor_working_timezone** | **List[str]** |  | [optional] 
**word_count** | **int** |  | [optional] 
**wordbee** | **int** |  | [optional] 
**wordfast** | **int** |  | [optional] 
**work_type** | **str** |  | [optional] 
**work_with** | **str** |  | [optional] 
**working_as** | **List[str]** |  | [optional] 
**xbench** | **int** |  | [optional] 
**xtm** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.filter_vendor_request import FilterVendorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of FilterVendorRequest from a JSON string
filter_vendor_request_instance = FilterVendorRequest.from_json(json)
# print the JSON string representation of the object
print(FilterVendorRequest.to_json())

# convert the object into a dict
filter_vendor_request_dict = filter_vendor_request_instance.to_dict()
# create an instance of FilterVendorRequest from a dict
filter_vendor_request_from_dict = FilterVendorRequest.from_dict(filter_vendor_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


