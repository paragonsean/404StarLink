

# GoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest

The request message to annotate an Assessment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotation** | [**AnnotationEnum**](#AnnotationEnum) | Optional. The annotation that will be assigned to the Event. This field can be left empty to provide reasons that apply to an event without concluding whether the event is legitimate or fraudulent. |  [optional] |
|**hashedAccountId** | **byte[]** | Optional. Unique stable hashed user identifier to apply to the assessment. This is an alternative to setting the hashed_account_id in CreateAssessment, for example when the account identifier is not yet known in the initial request. It is recommended that the identifier is hashed using hmac-sha256 with stable secret. |  [optional] |
|**reasons** | [**List&lt;ReasonsEnum&gt;**](#List&lt;ReasonsEnum&gt;) | Optional. Optional reasons for the annotation that will be assigned to the Event. |  [optional] |
|**transactionEvent** | [**GoogleCloudRecaptchaenterpriseV1TransactionEvent**](GoogleCloudRecaptchaenterpriseV1TransactionEvent.md) |  |  [optional] |



## Enum: AnnotationEnum

| Name | Value |
|---- | -----|
| ANNOTATION_UNSPECIFIED | &quot;ANNOTATION_UNSPECIFIED&quot; |
| LEGITIMATE | &quot;LEGITIMATE&quot; |
| FRAUDULENT | &quot;FRAUDULENT&quot; |
| PASSWORD_CORRECT | &quot;PASSWORD_CORRECT&quot; |
| PASSWORD_INCORRECT | &quot;PASSWORD_INCORRECT&quot; |



## Enum: List&lt;ReasonsEnum&gt;

| Name | Value |
|---- | -----|
| REASON_UNSPECIFIED | &quot;REASON_UNSPECIFIED&quot; |
| CHARGEBACK | &quot;CHARGEBACK&quot; |
| CHARGEBACK_FRAUD | &quot;CHARGEBACK_FRAUD&quot; |
| CHARGEBACK_DISPUTE | &quot;CHARGEBACK_DISPUTE&quot; |
| REFUND | &quot;REFUND&quot; |
| REFUND_FRAUD | &quot;REFUND_FRAUD&quot; |
| TRANSACTION_ACCEPTED | &quot;TRANSACTION_ACCEPTED&quot; |
| TRANSACTION_DECLINED | &quot;TRANSACTION_DECLINED&quot; |
| PAYMENT_HEURISTICS | &quot;PAYMENT_HEURISTICS&quot; |
| INITIATED_TWO_FACTOR | &quot;INITIATED_TWO_FACTOR&quot; |
| PASSED_TWO_FACTOR | &quot;PASSED_TWO_FACTOR&quot; |
| FAILED_TWO_FACTOR | &quot;FAILED_TWO_FACTOR&quot; |
| CORRECT_PASSWORD | &quot;CORRECT_PASSWORD&quot; |
| INCORRECT_PASSWORD | &quot;INCORRECT_PASSWORD&quot; |
| SOCIAL_SPAM | &quot;SOCIAL_SPAM&quot; |



