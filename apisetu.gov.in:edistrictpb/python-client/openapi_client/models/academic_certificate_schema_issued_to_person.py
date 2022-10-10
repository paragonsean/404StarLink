# coding: utf-8

"""
    Punjab State eGovernance Society, Punjab

    eDistrict Punjab (http://edistrict.punjabgovt.gov.in) is the online service delivery portal for Punjab State Govt. Certain documents issued by it (e.g. Residence, SC/ST, OBC Certificates etc) can be pulled into citizens' DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List
from typing_extensions import Annotated
from openapi_client.models.academic_certificate_schema_issued_to_person_address import AcademicCertificateSchemaIssuedToPersonAddress
from openapi_client.models.academic_certificate_schema_issued_to_person_photo import AcademicCertificateSchemaIssuedToPersonPhoto
from typing import Optional, Set
from typing_extensions import Self

class AcademicCertificateSchemaIssuedToPerson(BaseModel):
    """
    AcademicCertificateSchemaIssuedToPerson
    """ # noqa: E501
    address: AcademicCertificateSchemaIssuedToPersonAddress = Field(alias="Address")
    photo: AcademicCertificateSchemaIssuedToPersonPhoto = Field(alias="Photo")
    category: Annotated[str, Field(min_length=1, strict=True)]
    disability_status: StrictStr = Field(alias="disabilityStatus")
    dob: Annotated[str, Field(min_length=1, strict=True)]
    email: StrictStr
    gender: StrictStr
    marital_status: StrictStr = Field(alias="maritalStatus")
    mother_name: Annotated[str, Field(min_length=1, strict=True)] = Field(alias="motherName")
    name: Annotated[str, Field(min_length=1, strict=True)]
    phone: StrictStr
    religion: StrictStr
    swd: Annotated[str, Field(min_length=1, strict=True)]
    swd_indicator: Annotated[str, Field(min_length=1, strict=True)] = Field(alias="swdIndicator")
    title: StrictStr
    uid: StrictStr
    __properties: ClassVar[List[str]] = ["Address", "Photo", "category", "disabilityStatus", "dob", "email", "gender", "maritalStatus", "motherName", "name", "phone", "religion", "swd", "swdIndicator", "title", "uid"]

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
        """Create an instance of AcademicCertificateSchemaIssuedToPerson from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of address
        if self.address:
            _dict['Address'] = self.address.to_dict()
        # override the default output from pydantic by calling `to_dict()` of photo
        if self.photo:
            _dict['Photo'] = self.photo.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AcademicCertificateSchemaIssuedToPerson from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Address": AcademicCertificateSchemaIssuedToPersonAddress.from_dict(obj["Address"]) if obj.get("Address") is not None else None,
            "Photo": AcademicCertificateSchemaIssuedToPersonPhoto.from_dict(obj["Photo"]) if obj.get("Photo") is not None else None,
            "category": obj.get("category"),
            "disabilityStatus": obj.get("disabilityStatus"),
            "dob": obj.get("dob"),
            "email": obj.get("email"),
            "gender": obj.get("gender"),
            "maritalStatus": obj.get("maritalStatus"),
            "motherName": obj.get("motherName"),
            "name": obj.get("name"),
            "phone": obj.get("phone"),
            "religion": obj.get("religion"),
            "swd": obj.get("swd"),
            "swdIndicator": obj.get("swdIndicator"),
            "title": obj.get("title"),
            "uid": obj.get("uid")
        })
        return _obj


