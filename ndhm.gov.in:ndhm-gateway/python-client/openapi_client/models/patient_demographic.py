# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.auth_confirm_identifier import AuthConfirmIdentifier
from openapi_client.models.patient_gender import PatientGender
from typing import Optional, Set
from typing_extensions import Self

class PatientDemographic(BaseModel):
    """
    Demographic details are only required for demographic auth at this point. Demographic details must be same as registered
    """ # noqa: E501
    date_of_birth: StrictStr = Field(description="date of birth in YYYY-MM-DD format.", alias="dateOfBirth")
    gender: PatientGender
    identifier: Optional[AuthConfirmIdentifier] = None
    name: StrictStr
    __properties: ClassVar[List[str]] = ["dateOfBirth", "gender", "identifier", "name"]

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
        """Create an instance of PatientDemographic from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of identifier
        if self.identifier:
            _dict['identifier'] = self.identifier.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PatientDemographic from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "dateOfBirth": obj.get("dateOfBirth"),
            "gender": obj.get("gender"),
            "identifier": AuthConfirmIdentifier.from_dict(obj["identifier"]) if obj.get("identifier") is not None else None,
            "name": obj.get("name")
        })
        return _obj


