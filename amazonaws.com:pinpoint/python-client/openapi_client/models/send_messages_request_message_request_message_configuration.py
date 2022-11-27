# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
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
from openapi_client.models.direct_message_configuration_adm_message import DirectMessageConfigurationADMMessage
from openapi_client.models.direct_message_configuration_apns_message import DirectMessageConfigurationAPNSMessage
from openapi_client.models.direct_message_configuration_baidu_message import DirectMessageConfigurationBaiduMessage
from openapi_client.models.direct_message_configuration_default_message import DirectMessageConfigurationDefaultMessage
from openapi_client.models.direct_message_configuration_default_push_notification_message import DirectMessageConfigurationDefaultPushNotificationMessage
from openapi_client.models.direct_message_configuration_email_message import DirectMessageConfigurationEmailMessage
from openapi_client.models.direct_message_configuration_gcm_message import DirectMessageConfigurationGCMMessage
from openapi_client.models.direct_message_configuration_sms_message import DirectMessageConfigurationSMSMessage
from openapi_client.models.direct_message_configuration_voice_message import DirectMessageConfigurationVoiceMessage
from typing import Optional, Set
from typing_extensions import Self

class SendMessagesRequestMessageRequestMessageConfiguration(BaseModel):
    """
    SendMessagesRequestMessageRequestMessageConfiguration
    """ # noqa: E501
    adm_message: Optional[DirectMessageConfigurationADMMessage] = Field(default=None, alias="ADMMessage")
    apns_message: Optional[DirectMessageConfigurationAPNSMessage] = Field(default=None, alias="APNSMessage")
    baidu_message: Optional[DirectMessageConfigurationBaiduMessage] = Field(default=None, alias="BaiduMessage")
    default_message: Optional[DirectMessageConfigurationDefaultMessage] = Field(default=None, alias="DefaultMessage")
    default_push_notification_message: Optional[DirectMessageConfigurationDefaultPushNotificationMessage] = Field(default=None, alias="DefaultPushNotificationMessage")
    email_message: Optional[DirectMessageConfigurationEmailMessage] = Field(default=None, alias="EmailMessage")
    gcm_message: Optional[DirectMessageConfigurationGCMMessage] = Field(default=None, alias="GCMMessage")
    sms_message: Optional[DirectMessageConfigurationSMSMessage] = Field(default=None, alias="SMSMessage")
    voice_message: Optional[DirectMessageConfigurationVoiceMessage] = Field(default=None, alias="VoiceMessage")
    __properties: ClassVar[List[str]] = ["ADMMessage", "APNSMessage", "BaiduMessage", "DefaultMessage", "DefaultPushNotificationMessage", "EmailMessage", "GCMMessage", "SMSMessage", "VoiceMessage"]

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
        """Create an instance of SendMessagesRequestMessageRequestMessageConfiguration from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of adm_message
        if self.adm_message:
            _dict['ADMMessage'] = self.adm_message.to_dict()
        # override the default output from pydantic by calling `to_dict()` of apns_message
        if self.apns_message:
            _dict['APNSMessage'] = self.apns_message.to_dict()
        # override the default output from pydantic by calling `to_dict()` of baidu_message
        if self.baidu_message:
            _dict['BaiduMessage'] = self.baidu_message.to_dict()
        # override the default output from pydantic by calling `to_dict()` of default_message
        if self.default_message:
            _dict['DefaultMessage'] = self.default_message.to_dict()
        # override the default output from pydantic by calling `to_dict()` of default_push_notification_message
        if self.default_push_notification_message:
            _dict['DefaultPushNotificationMessage'] = self.default_push_notification_message.to_dict()
        # override the default output from pydantic by calling `to_dict()` of email_message
        if self.email_message:
            _dict['EmailMessage'] = self.email_message.to_dict()
        # override the default output from pydantic by calling `to_dict()` of gcm_message
        if self.gcm_message:
            _dict['GCMMessage'] = self.gcm_message.to_dict()
        # override the default output from pydantic by calling `to_dict()` of sms_message
        if self.sms_message:
            _dict['SMSMessage'] = self.sms_message.to_dict()
        # override the default output from pydantic by calling `to_dict()` of voice_message
        if self.voice_message:
            _dict['VoiceMessage'] = self.voice_message.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SendMessagesRequestMessageRequestMessageConfiguration from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ADMMessage": DirectMessageConfigurationADMMessage.from_dict(obj["ADMMessage"]) if obj.get("ADMMessage") is not None else None,
            "APNSMessage": DirectMessageConfigurationAPNSMessage.from_dict(obj["APNSMessage"]) if obj.get("APNSMessage") is not None else None,
            "BaiduMessage": DirectMessageConfigurationBaiduMessage.from_dict(obj["BaiduMessage"]) if obj.get("BaiduMessage") is not None else None,
            "DefaultMessage": DirectMessageConfigurationDefaultMessage.from_dict(obj["DefaultMessage"]) if obj.get("DefaultMessage") is not None else None,
            "DefaultPushNotificationMessage": DirectMessageConfigurationDefaultPushNotificationMessage.from_dict(obj["DefaultPushNotificationMessage"]) if obj.get("DefaultPushNotificationMessage") is not None else None,
            "EmailMessage": DirectMessageConfigurationEmailMessage.from_dict(obj["EmailMessage"]) if obj.get("EmailMessage") is not None else None,
            "GCMMessage": DirectMessageConfigurationGCMMessage.from_dict(obj["GCMMessage"]) if obj.get("GCMMessage") is not None else None,
            "SMSMessage": DirectMessageConfigurationSMSMessage.from_dict(obj["SMSMessage"]) if obj.get("SMSMessage") is not None else None,
            "VoiceMessage": DirectMessageConfigurationVoiceMessage.from_dict(obj["VoiceMessage"]) if obj.get("VoiceMessage") is not None else None
        })
        return _obj


