# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class AuthenticationMode(str, Enum):
    """
    Subjected to CM specific capability  1. MOBILE_OTP - for SMS OTP  2. DIRECT - for authentication directly with the patient. e.g. Mobile App, SMS  3. AADHAAR_OTP - for auth using OTP sent to Aadhaar number  4. DEMOGRAPHICS - for auth using demographic verification. 
    """

    """
    allowed enum values
    """
    MOBILE_OTP = 'MOBILE_OTP'
    DIRECT = 'DIRECT'
    DEMOGRAPHICS = 'DEMOGRAPHICS'
    AADHAAR_OTP = 'AADHAAR_OTP'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of AuthenticationMode from a JSON string"""
        return cls(json.loads(json_str))


