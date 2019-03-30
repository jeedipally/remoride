CREATE TABLE `loan` (
	`loanId` INT(11) NOT NULL,
	`name` VARCHAR(50) NULL DEFAULT NULL,
	`loanType` VARCHAR(50) NULL DEFAULT NULL,
	`loanAmount` VARCHAR(50) NULL DEFAULT NULL,
	`loanStatus` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`loanId`)
);

CREATE TABLE  `customer`(
	`id` INT(11) NOT NULL,
	`loanId` VARCHAR(10) NULL DEFAULT NULL,
	`name` VARCHAR(50) NULL DEFAULT NULL,
	`salaryType` VARCHAR(50) NULL DEFAULT NULL,
	`loan` VARCHAR(50) NULL DEFAULT NULL,
	`rentedhouse` VARCHAR(10) NULL DEFAULT NULL,
	`salAmount` VARCHAR(10) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
);
