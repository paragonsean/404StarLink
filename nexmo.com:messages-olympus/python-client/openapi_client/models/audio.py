# coding: utf-8

"""
    Messages API

    The Messages API consolidates and normalises exchanges across all messaging channels. It allows you to use a single API to interact with our various channels such as SMS, MMS, WhatsApp, Viber and Facebook Messenger

    The version of the OpenAPI document: 1.4.0
    Contact: devrel@nexmo.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.audio1_audio import Audio1Audio
from typing import Optional, Set
from typing_extensions import Self

class Audio(BaseModel):
    """
    Audio
    """ # noqa: E501
    client_ref: Optional[StrictStr] = Field(default=None, description="Client reference of up to 100 characters. The reference will be present in every message status.")
    audio: Audio1Audio
    message_type: StrictStr = Field(description="The type of message to send. You must provide `audio` in this field")
    __properties: ClassVar[List[str]] = ["client_ref", "audio", "message_type"]

    @field_validator('message_type')
    def message_type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['audio']):
            raise ValueError("must be one of enum values ('audio')")
        return value

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
        """Create an instance of Audio from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of audio
        if self.audio:
            _dict['audio'] = self.audio.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Audio from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "client_ref": obj.get("client_ref"),
            "audio": Audio1Audio.from_dict(obj["audio"]) if obj.get("audio") is not None else None,
            "message_type": obj.get("message_type")
        })
        return _obj


