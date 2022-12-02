# coding: utf-8

"""
    Amazon Kinesis Firehose

    <fullname>Amazon Kinesis Data Firehose API Reference</fullname> <p>Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such as Amazon Simple Storage Service (Amazon S3), Amazon OpenSearch Service, Amazon Redshift, Splunk, and various other supportd destinations.</p>

    The version of the OpenAPI document: 2015-08-04
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.delivery_stream_encryption_configuration_failure_description import DeliveryStreamEncryptionConfigurationFailureDescription
from typing import Optional, Set
from typing_extensions import Self

class DeliveryStreamEncryptionConfiguration(BaseModel):
    """
    Contains information about the server-side encryption (SSE) status for the delivery stream, the type customer master key (CMK) in use, if any, and the ARN of the CMK. You can get <code>DeliveryStreamEncryptionConfiguration</code> by invoking the <a>DescribeDeliveryStream</a> operation. 
    """ # noqa: E501
    key_arn: Optional[Any] = Field(default=None, alias="KeyARN")
    key_type: Optional[Any] = Field(default=None, alias="KeyType")
    status: Optional[Any] = Field(default=None, alias="Status")
    failure_description: Optional[DeliveryStreamEncryptionConfigurationFailureDescription] = Field(default=None, alias="FailureDescription")
    __properties: ClassVar[List[str]] = ["KeyARN", "KeyType", "Status", "FailureDescription"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of DeliveryStreamEncryptionConfiguration from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of key_type
        if self.key_type:
            _dict['KeyType'] = self.key_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['Status'] = self.status.to_dict()
        # override the default output from pydantic by calling `to_dict()` of failure_description
        if self.failure_description:
            _dict['FailureDescription'] = self.failure_description.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of DeliveryStreamEncryptionConfiguration from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "KeyARN": obj.get("KeyARN"),
            "KeyType": KeyType.from_dict(obj["KeyType"]) if obj.get("KeyType") is not None else None,
            "Status": DeliveryStreamEncryptionStatus.from_dict(obj["Status"]) if obj.get("Status") is not None else None,
            "FailureDescription": DeliveryStreamEncryptionConfigurationFailureDescription.from_dict(obj["FailureDescription"]) if obj.get("FailureDescription") is not None else None
        })
        return _obj


