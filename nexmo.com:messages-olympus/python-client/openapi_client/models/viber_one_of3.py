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
from typing_extensions import Annotated
from openapi_client.models.channel_options_viber_viber_service import ChannelOptionsViberViberService
from openapi_client.models.viber_one_of3_all_of_file import ViberOneOf3AllOfFile
from typing import Optional, Set
from typing_extensions import Self

class ViberOneOf3(BaseModel):
    """
    ViberOneOf3
    """ # noqa: E501
    client_ref: Optional[StrictStr] = Field(default=None, description="Client reference of up to 100 characters. The reference will be present in every message status.")
    file: ViberOneOf3AllOfFile
    message_type: StrictStr = Field(description="The type of message to send. You must provide `file` in this field")
    channel: StrictStr = Field(description="The channel to send to. You must provide `viber_service` in this field")
    var_from: Annotated[str, Field(min_length=1, strict=True, max_length=50)] = Field(description="The ID of the message sender ", alias="from")
    to: Annotated[str, Field(min_length=7, strict=True, max_length=15)] = Field(description="The phone number of the message **recipient** in the [E.164](https://en.wikipedia.org/wiki/E.164) format. Don't use a leading + or 00 when entering a phone number, start with the country code, for example, 447700900000. ")
    viber_service: Optional[ChannelOptionsViberViberService] = None
    __properties: ClassVar[List[str]] = ["client_ref", "file", "message_type", "channel", "from", "to", "viber_service"]

    @field_validator('message_type')
    def message_type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['file']):
            raise ValueError("must be one of enum values ('file')")
        return value

    @field_validator('channel')
    def channel_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['viber_service']):
            raise ValueError("must be one of enum values ('viber_service')")
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
        """Create an instance of ViberOneOf3 from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of file
        if self.file:
            _dict['file'] = self.file.to_dict()
        # override the default output from pydantic by calling `to_dict()` of viber_service
        if self.viber_service:
            _dict['viber_service'] = self.viber_service.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ViberOneOf3 from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "client_ref": obj.get("client_ref"),
            "file": ViberOneOf3AllOfFile.from_dict(obj["file"]) if obj.get("file") is not None else None,
            "message_type": obj.get("message_type"),
            "channel": obj.get("channel"),
            "from": obj.get("from"),
            "to": obj.get("to"),
            "viber_service": ChannelOptionsViberViberService.from_dict(obj["viber_service"]) if obj.get("viber_service") is not None else None
        })
        return _obj


